import java.io.File;

import net.dbaeye.cache.Cache;
import net.dbaeye.cache.CacheManager;

public class TestCache {
	
	private static final String CACHE_KEY_PREFIX = "com.net365.session" + "#";
	private static Cache testCache = CacheManager.getCache("com.net365.session");
	

	public static void main(String[] args) {

		
		
		if(testCache.get(CACHE_KEY_PREFIX+"test")==null){
			testCache.put(CACHE_KEY_PREFIX +"test","zhangsongfufdfdfdfdfdfdfd");
			//System.out.println(testCache.get(CACHE_KEY_PREFIX +"test"));
		}else{
			System.out.println(testCache.get(CACHE_KEY_PREFIX +"test"));
		}

	}

}
