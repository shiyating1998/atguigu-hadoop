package com.atguigu.practitioner2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class ProvincePartitioner extends Partitioner<Text, FlowBean> {
    @Override
    public int getPartition(Text text, FlowBean flowBean, int i) {

        String phone = text.toString();
        String dig = phone.substring(0,3);
        int partition  = 4;
        if (("136").equals(dig)){
            partition  = 0;
        }
        else if(("137").equals(dig)){
            partition  = 1;
        }
        else if(("138").equals(dig)){
            partition  = 2;
        }
        else if (("139").equals(dig)){
            partition  = 3;
        }
        return partition;
    }
}
