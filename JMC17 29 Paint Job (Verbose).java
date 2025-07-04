public class PaintJob {
    
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        
        double area = width * height;
        int necessaryBuckets = (int) Math.ceil(area / areaPerBucket);
        
        return necessaryBuckets - extraBuckets;
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    public static int getBucketCount(double area, double areaPerBucket) {
        
        if (area <= 0) {
            return -1;
        }
        
        return getBucketCount(Math.sqrt(area), Math.sqrt(area), areaPerBucket, 0);
    }
}
