package com.canvas.product.service.impl;

import com.canvas.product.common.DecreaseStockInput;
import com.canvas.product.enums.ProductStatusEnum;
import com.canvas.product.enums.ResultEnum;
import com.canvas.product.exception.ProductException;
import com.canvas.product.pojo.ProductInfo;
import com.canvas.product.repository.ProductInfoRepository;
import com.canvas.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:08
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {

        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());

    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<DecreaseStockInput> cartDTOList) {
        for (DecreaseStockInput decreaseStockInput : cartDTOList) {
            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(decreaseStockInput.getProductId());
            // 判断商品是否存在
            if (!productInfoOptional.isPresent()) {
                log.error("【查询商品】没有该商品, productId: {}", decreaseStockInput.getProductId());
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            // 库存是否足够
            ProductInfo productInfo = productInfoOptional.get();
            Integer result = productInfo.getProductStock() - decreaseStockInput.getProductQuantity();
            if (result < 0) {
                log.error("【扣库存】数量不足, 库中库存: {}, 购买数量: {}", productInfo.getProductStock(), decreaseStockInput.getProductQuantity());
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);

            productInfoRepository.save(productInfo);
        }
    }
}
