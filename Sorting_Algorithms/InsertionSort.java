int temp;
int length = a.length;
int swapFrom = 0;
int left = 0;
int right = 1;

for(int i=0; i<length-1; i++){
	if(a[left]>a[right]){
		for(int j=right-1; j>=0; j--){
			swapFrom = 0;
			if(a[j]<a[right]){
				swapFrom = j+1;
				break;
			}
		}

		for(int k=swapFrom; k<right; k++){
			temp = a[right];
			a[right] = a[k];
			a[k] = temp;
		}
	}
	left++;
	right++;
}

for(int i=0; i<length; i++){
	System.out.println(a[i]);
}