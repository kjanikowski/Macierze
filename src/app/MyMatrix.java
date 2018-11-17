package app;


public class MyMatrix<T> {

	private int height;
	private int width; 
	
	//// nowy poczatek
	private T[][] tab;
	private final Class<T> type;
	final int zakres= 65536;
	
	/////

	
	
	
	@SuppressWarnings("unchecked")
	public MyMatrix(int height, int width, Class<T> type) {	
		tab = (T[][]) new Object[height][width];
		this.height = height;
		this.width = width;
		
		this.type = type;
	}
	
	public int getLenght()
	{
		return height;
	}
	
	public T getPartitionOfMatrix(int i, int j)
	{
		return tab[i][j];
	}
	
	@SuppressWarnings("unchecked")
	public void pop() {
		
		
		TC rand = new TC();
		if(type == Float.class) {
			for(int i = 0; i<height; i++)
				for(int j = 0; j < width; j++) {
					Object o = ((float) rand.nextInt(zakres*2) - zakres)/zakres;
					tab[i][j] = (T) o;
				}
			
		}else if(type == Double.class){
			for(int i = 0; i<height; i++)
				for(int j = 0; j < width; j++) {
					Object o = ((double) rand.nextInt(zakres*2) - zakres)/zakres;
					tab[i][j] = (T) o;
				}
		}else if(type == TC.class){
			for(int i = 0; i<height; i++)
				for(int j = 0; j < width; j++) {
					Object o = rand.nextTC();
					tab[i][j] = (T) o;
				}
		}
		
	}
	
		

	
	public void test() {	
		for(int i = 0; i<height; i++) {
				System.out.println("\n");
			for(int j = 0; j < width; j++) {
				
				System.out.print(tab[i][j].toString() + " ");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public T add(T one, T two) {
		if(type == Float.class) {
			return (T) (Object) ((float) one + (float) two);
		}else if(type == Double.class) {
			return (T) (Object) ((double) one + (double) two);

		}else if(type == TC.class) {
			
			return (T) TC.add((TC)one,(TC)two);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T sub(T one, T two) {
		if(type == Float.class) {
			return (T) (Object) ((float) one - (float) two);
		}else if(type == Double.class) {
			return (T) (Object) ((double) one - (double) two);

		}else if(type == TC.class) {
			
			return (T) TC.sub((TC)one,(TC)two);
		}
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public T div(T one, T two) {
		if(type == Float.class) {
			return (T) (Object) ((float) one / (float) two);
		}else if(type == Double.class) {
			return (T) (Object) ((double) one / (double) two);

		}else if(type == TC.class) {
			
			return (T) TC.div((TC)one,(TC)two);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T mul(T one, T two) {
		if(type == Float.class) {
			return (T) (Object) ((float) one * (float) two);
		}else if(type == Double.class) {
			return (T) (Object) ((double) one * (double) two);

		}else if(type == TC.class) {
			
			return (T) TC.mul((TC)one,(TC)two);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T abs(T one) {
		if(type == Float.class) {
			return (T) (Object) Math.abs((float)one);
		}else if(type == Double.class) {
			return (T) (Object) Math.abs((double)one);

		}else if(type == TC.class) {
			
			return (T) TC.abs((TC) one);
		}
		return null;
	}
	
	public void swap(int height1, int width1, int height2, int width2) {
		
		T temp = tab[height1][width1];
		tab[height1][width1] = tab[height2][width2];
		tab[height2][width2] = temp;
	}
	
}
	
