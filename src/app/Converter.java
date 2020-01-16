package app;





public class Converter {
    public static boolean numericVerifier(String tmp){
        if(tmp.matches("^[+]?([.]\\d+|\\d+[.]?\\d*)$") && tmp.length()>0 ){
            return true;
        }
        else{
            return false;
        }
    }
    public static Tuple mConvert(Unit m){
        Tuple tuple = new Tuple();
        if(m.getCode().contains("1")){
            tuple.setFirst(m.getValue());
            tuple.setSecond(m.getValue()*2.54);
            tuple.setThird(m.getValue()*30.48);
            return tuple;
        }
        if(m.getCode().contains("2")){
            tuple.setFirst(m.getValue()/0.39370);
            tuple.setSecond(m.getValue());
            tuple.setThird(m.getValue()*0.083333);
        }
        if(m.getCode().contains("3")){
            tuple.setFirst(m.getValue()/0.032808);
            tuple.setSecond(m.getValue()*12);
            tuple.setThird(m.getValue());

        }


        return tuple;
    }
    public static Tuple wConvert(Unit m){
      Tuple tuple = new Tuple();
        if(m.getCode().contains("1")){
            tuple.setFirst(m.getValue());
            tuple.setSecond(m.getValue()/28.3495231);
            tuple.setThird(m.getValue()/453.59237);
            return tuple;
        }
        if(m.getCode().contains("2")){
            tuple.setFirst(m.getValue()/0.035274);
            tuple.setSecond(m.getValue());
            tuple.setThird(m.getValue()*0.062500);
        }
        if(m.getCode().contains("3")){
            tuple.setFirst(m.getValue()/0.0022046);
            tuple.setSecond(m.getValue()*16.000);
            tuple.setThird(m.getValue());

        }


        return tuple;
    }

    public static Tuple vConvert(Unit m){
      Tuple tuple = new Tuple();
        if(m.getCode().contains("1")){
            tuple.setFirst(m.getValue());
            tuple.setSecond(m.getValue()*0.6213712);
            tuple.setThird(m.getValue()*0.5399568);
            return tuple;
        }
        if(m.getCode().contains("2")){
            tuple.setFirst(m.getValue()*1.609344);
            tuple.setSecond(m.getValue());
            tuple.setThird(m.getValue()*0.083333);
        }
        if(m.getCode().contains("3")){
            tuple.setFirst(m.getValue()/1.852000);
            tuple.setSecond(m.getValue()*1.150779);
            tuple.setThird(m.getValue());

        }


        return tuple;
    }

}
