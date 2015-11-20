package me.virustotal.traincarts;

public class TrigMath {
	
    public static double atan(final double arg) 
    {
        return (arg > 0.0) ? msatan(arg) : (-msatan(-arg));
    }
    
    private static double msatan(final double arg) 
    {
        return (arg < 0.41421356237309503) ? mxatan(arg) : ((arg > 2.414213562373095) ? (1.5707963267948966 - mxatan(1.0 / arg)) : (0.7853981633974483 + mxatan((arg - 1.0) / (arg + 1.0))));
    }
    
    private static double mxatan(final double arg) 
    {
        final double argsq = arg * arg;
        double value = (((16.15364129822302 * argsq + 268.42548195503974) * argsq + 1153.029351540485) * argsq + 1780.406316433197) * argsq + 896.7859740366387;
        value /= ((((argsq + 58.95697050844462) * argsq + 536.2653740312153) * argsq + 1666.7838148816338) * argsq + 2079.33497444541) * argsq + 896.7859740366387;
        return value * arg;
    }
    
    public static double atan2(double arg1, final double arg2) {
        if (arg1 + arg2 == arg1) {
            return (arg1 >= 0.0) ? 1.5707963267948966 : -1.5707963267948966;
        }
        arg1 = atan(arg1 / arg2);
        return (arg2 < 0.0) ? ((arg1 <= 0.0) ? (arg1 + 3.141592653589793) : (arg1 - 3.141592653589793)) : arg1;
    }

}
