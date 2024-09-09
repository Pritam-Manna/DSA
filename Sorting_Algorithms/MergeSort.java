class MergeSort{
	public static void main(String [] args){
		// System.out.println("Hi");
		int[] actual = { 5, 1, 6, 2, 3, 4 };
        mergeSort(actual, 0, actual.length-1);
        for(int item : actual){
            System.out.print(" "+ item + " ");
        }
	}

	public static void mergeSort(int [] arr, int l, int r){
    	if(l<r){
    		int m =  (r + l) / 2;
    		// System.out.println("l: "+l + ", m: "+m+", r: "+r);
    		mergeSort(arr, l, m);
    		mergeSort(arr, m+1, r);
    		merge(arr, l, m, r);
    	}
    }



	public static void merge(int [] arr, int l, int m, int r){
		int l_len = m - l + 1;
        int r_len = r - m;

    	int [] l_arr = new int [l_len];
    	int [] r_arr = new int [r_len];
    	
    
    	//copy the arrays 
    	for(int i=0; i<l_len; i++){
    		l_arr[i] = arr[l+i];
    	}
    	for(int i=0; i<r_len; i++){
    		r_arr[i] = arr[m+1+i];
    	}
        
        int i= 0, j=0, k=l;
    	while(i<l_len && j<r_len){
    		if(l_arr[i]<=r_arr[j]){
    			arr[k] = l_arr[i];
    			i++;
    		}else{
    			arr[k] = r_arr[j];
    			j++;
    		}
    		k++;
    	}
    
    	while(i<l_len){
    		arr[k] = l_arr[i];
    		i++;
    		k++;
    	}
    	while(j<r_len){
    		arr[k] = r_arr[j];
    		j++;
    		k++;
    	}
    }
}