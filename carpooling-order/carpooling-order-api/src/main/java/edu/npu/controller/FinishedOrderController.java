package edu.npu.controller;

import edu.npu.dto.RateDto;
import edu.npu.service.FinishedOrderService;
import edu.npu.vo.R;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : [wangminan]
 * @description : [订单完成后接口处理]
 */
@RestController
@RequestMapping("/finished")
public class FinishedOrderController {

    @Resource
    private FinishedOrderService finishedOrderService;

    @PostMapping("/passenger/rate/{orderId}")
    public R rateDriver(@PathVariable("orderId") Long orderId,
                        @Validated RateDto rateDto) {
        return finishedOrderService.rateDriver(orderId, rateDto);
    }
}
