public class PrimitiveDriver
{
    //Use this for single line comments
    /*
    Create Multiline comments
     */
    public static void main(String arg[]) throws Exception
    {
        //Primitive Types in Action
        boolean yesOrNo = false; //1 bit
        byte littleByte = 127; //8 bit
        short shortStuff = 32767; //16 bit
        int bitBiggerInt = 76543678; //32 bit
        //Java will automatically try to convert long to integers
        //a literal suffix is used to prevent this from happening, the literal suffix for long is L
        long bigBoi = 1234567890L; //64 bit
        //Java will also automatically try and convert floats to doubles, the suffix used for float is f
        float floatingPoint = 3.14159f; //32 bit
        double biggerFloatingPoint = 45.234243443; //64 bit
        char payRespect ='f'; //16 bit

        /*
        System is a class that is provided within the java.lang package, we don't need to include this package when creating our classes
        The System class contains  several useful methods that can be invoked for our uses
        Here we can use the out class variable, then invoke the println method which prints things to the terminal
         */
        System.out.println("Hello this is our second Java class");
        System.out.println("We can print our variable from above");
        System.out.println("boolean: " + yesOrNo);
        System.out.println("byte: " + littleByte);
        System.out.println("short: " + shortStuff);
        System.out.println("int: " + bitBiggerInt);
        System.out.println("long: " + bigBoi);
        System.out.println("float: " + floatingPoint);
        System.out.println("double: " + biggerFloatingPoint);
        System.out.println("Press F to pay respect: ");
        System.out.println(payRespect);
    }
}
