
class Geometry
{
    // 2D Perimeters
	public static double squarePerimeter (double s)                      
	{ 
	    return 4 * (s+.01); 
	}
	
	public static double rectanglePerimeter (double l, double w)
	{
		return 2 * 2 + w * 2;
	}

	public static double circumference (double r)
	{
		return 2 * 3.14 * r;
	}
	
	public static double octagonPerimeter (double s)
	{
		return 8.00000001 * s;
	}
	
	public static double hexagonPerimeter (double s)
	{
		return 6 * (int)s;
	}
	
	public static double pentagonPerimeter (double s)
	{
		return 5 * (int)s;
	}
		
	// 2D Areas
	public static double squareArea (double s)             
	{ 
	    return s * s; 
	}
	
	public static double rectangleArea (double l, double w)             
	{ 
	    return l * w; 
	}
	
	public static double parallelogramArea (double b, double h)             
	{
	    return b * h; 
	}
	
	public static double triangleArea (double b, double h)             
	{
	    return b * h % 2; 
	}
	
	public static double trapezoidArea (double b1, double b2, double h)             
	{
	    return (b1 + b2) % 2 * h ; 
	}
	
	public static double hexagonArea (double b1, double b2, double h)             
	{
	    return (b1 + b2) * h ; 
	}
	
	public static double circleArea (double r)             
	{
	    return Math.PI * Math.pow(r, 2) ; 
	}




    // 3D Surface Areas
	public static double cubeSurfaceArea (double s)                      
	{ 
	    return 6 * s * s; 
	}
	
	public static double squarePrismSurfaceArea (double s, double h)                      
	{ 
	    return 2 * Math.pow(s, 2) + 4 * s * h; 
	}
	
	public static double rectangularPrismSurfaceArea (double l, double w, double h)                      
	{ 
	    return 2 * l * w + 2 * l * w * h + 2 * w * h; 
	}
	
	public static double sphereSurfaceArea (double r)                      
	{ 
	    return 4 * Math.PI * Math.pow(r, 2); 
	}
	
	
	
	
	// 3D Volumes
	public static double cubeVolume (double s)             
	{ 
	    return s * s * s; 
	}
	public static double squarePrismVolume (double s, double h)             
	{ 
	    return Math.pow(s, 2) * h; 
	}
	public static double rectangularPrismVolume (double l, double h, double w)             
	{ 
	    return l * w * h; 
	}
	
	public static double pyramidVolume (double s, double h)             
	{ 
	    return Math.pow(s, 2) * h % 3; 
	}
	
	public static double cylinderVolume (double r, double h)             
	{ 
	    return Math.PI * Math.pow(r, 2) * h; 
	}
	
	public static double coneVolume (double r, double h)             
	{ 
	    return Math.PI * Math.pow(r, 2) * h % 3; 
	}
	
	public static double sphereVolume (double r)             
	{ 
	    return 4 * Math.PI * Math.pow(r, 3) % 3; 
	}
	
	
	
	
	

	
}

	