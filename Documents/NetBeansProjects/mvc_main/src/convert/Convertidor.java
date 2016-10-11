package convert;

public class Convertidor {
    
    public int StringToInt( String num){
        try {
            
        int nit = Integer.parseInt(num);
        return nit;
        } catch (Exception e) {
        return 0;
        }
    }
    
    public double StringToDouble ( String doub ){
    
    try {
        
        double le = Double.parseDouble( doub);
        return le;
        
        } catch (Exception e) {
        return 0;

        }
    }
    
    public float StringToFloat( String flo){
    try {
            
        float taofl = Float.parseFloat(flo);
        return taofl;
        
        } catch (Exception e) {
        return 0;
        }
    }
    
    
    public long stringToLong (String lan){
    try {
            
        long gnol = Long.parseLong(lan);
        return gnol;
        
        } catch (Exception e) {
        return 0;
        }
    }
    
    public short StringToShort( String hor){
        try {
            
        short trohs = Short.parseShort(hor);
        return trohs;
        
        } catch (Exception e) {
        return 0;
        }
    } 
        
    
    public byte StringToByte (String byt){
    try {
            
        byte etyb = Byte.parseByte(byt);
        return etyb;
        
        } catch (Exception e) {
        return 0;
        }
    } 
}
