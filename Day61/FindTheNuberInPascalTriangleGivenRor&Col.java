int func(n,r)
  {
  int ans=1;
  for(int i=0;i<r;i++)
    {
      res=res*(n-i);
      res=res/(i+1); //coz when i is 0 we take 1 i.e i+1
    }
  return res;
}
