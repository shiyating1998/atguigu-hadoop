package com.atguigu.outputformat;

import org.apache.commons.lang.ObjectUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class LogMapper extends Mapper<LongWritable, Text, Text, NullWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws InterruptedException, IOException {
        //不做任何处理,直接写出一行log数据
        context.write(value,NullWritable.get());
    }
}