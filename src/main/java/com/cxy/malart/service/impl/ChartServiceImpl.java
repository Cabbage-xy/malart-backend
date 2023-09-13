package com.cxy.malart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxy.malart.model.entity.Chart;
import com.cxy.malart.service.ChartService;
import com.cxy.malart.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 92127
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-09-13 20:48:23
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




