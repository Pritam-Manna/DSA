for(int i = 0; i<length; i++){
   for(int j = 0; j<length-i-1; j++){
      if(a[j]>a[j+1]){
         temp = a[j+1];
         a[j+1] = a[j];
         a[j] = temp;
      }
   }
}


for(int i=0; i<length; i++){
   System.out.println(a[i]);
}