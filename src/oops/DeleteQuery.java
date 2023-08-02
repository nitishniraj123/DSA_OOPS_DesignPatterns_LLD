package oops;

import java.util.ArrayList;
import java.util.List;

public class DeleteQuery {

    private static class DataDto{
        int startId;
        int endId;
        String tableName;
        String idName;

        public DataDto(int startId, int endId, String tableName , String idName) {
            this.startId = startId;
            this.endId = endId;
            this.tableName = tableName;
            this.idName = idName;
        }
    }


    public static void printDeleteQuery(int start , int end, String table , String idName ){
        for(int i=start;i<=end ;i=i+100000){
            int endString =i+100000;
            if(end-i < 100000){
                endString=end;
            }
            System.out.println("DELETE FROM " + table + " WHERE "+idName+" >="+i +" AND " +idName +"< "+endString+";");
        }
    }

    public static void main(String[] args) {
        List<DataDto> dataDtos = new ArrayList<>();
        /*dataDtos.add(new DataDto(272727259,344232465,"ORDERS_AUD","ORDER_ID"));
        dataDtos.add(new DataDto(272727259,344232465,"ORDERS","ORDER_ID"));
        dataDtos.add(new DataDto(246449477,322543173,"SUBORDER_AUD","ID"));*/
        dataDtos.add(new DataDto(3721,1262444805,"REVINFO","REV"));
        dataDtos.add(new DataDto(1,20385666,"gokwik_audit","id"));
        dataDtos.add(new DataDto(270075853,341543836,"ORDER_RISK_DETAILS","ORDER_RISK_DETAILS_ID"));
        dataDtos.add(new DataDto(228946046,300416251,"ADDRESS_DETAIL","ID"));
        dataDtos.add(new DataDto(222311035,293780544,"RTO_MODELS_PREDICTION","RTO_MODELS_PREDICTION_ID"));
        dataDtos.add(new DataDto(246449477,322543173,"SUBORDER","ID"));
        dataDtos.add(new DataDto(53129314,129923385,"DS_RTO_NM_MODEL_AUDIT","ID"));
        dataDtos.add(new DataDto(246449434,322543129,"SUBORDER_VENDOR_FINANCIAL","ID"));
        dataDtos.add(new DataDto(282241513,358335209,"SUPC_DETAILS","ID"));
        dataDtos.add(new DataDto(187122788,258473866,"SANDEH_ADDRESS_DETAILS","ID"));
        dataDtos.add(new DataDto(28280777,99748745,"DECISION_DETAILS","ID"));
        dataDtos.add(new DataDto(246449434,322543129,"ADDITIONAL_OFFER_DETAILS","ID"));
        dataDtos.add(new DataDto(37697984,109301364,"OVS_FLOW_ADDITIONAL_DETAILS","ID"));
        dataDtos.add(new DataDto(8068331,10510449,"CC_CALLING_QUEUE_AUD","CC_CALLING_QUEUE_ID"));
        dataDtos.add(new DataDto(4716869,21026862,"DUPLICATE_RISK_DETAILS","ID"));
        dataDtos.add(new DataDto(1,20286233,"gokwik_score","id"));
        dataDtos.add(new DataDto(8068331,10510449,"CC_CALLING_QUEUE","CC_CALLING_QUEUE_ID"));

        for(DataDto dataDto : dataDtos){
            printDeleteQuery(dataDto.startId , dataDto.endId , dataDto.tableName , dataDto.idName);
        }
    }
}


