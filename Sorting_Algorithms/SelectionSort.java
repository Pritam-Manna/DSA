int lowest;
int lowestIndx;
int temp;
int length = a.length;
for(int i=0; i<length; i++){
	lowestIndx = i;
	lowest = a[i];
	for(int j = i+1; j<length; j++){
		if(a[j]<lowest){
			lowestIndx = j;
			lowest = a[j];
		}
	}
	if(lowestIndx !=i){
		temp = a[lowestIndx];
		a[lowestIndx] = a[i];
		a[i] = temp;
	}
}

for(int i=0; i<length; i++){
	System.out.println(a[i]);
}