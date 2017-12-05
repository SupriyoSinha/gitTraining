

	public class SingletonTest {
		  // Private constructor prevents instantiation from other classes
		  private SingletonTest() {}
		 
		  /**
		   * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
		   * or the first access to SingletonHolder.INSTANCE, not before.
		   */
		  private static class SingletonHolder { 
		    private static final SingletonTest INSTANCE = new SingletonTest();
		  }

		  public  SingletonTest getInstance() {
		    return SingletonHolder.INSTANCE;
		  }
		}


