//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Program to find if the string is reapeated in the srray of strings
void main() {
    char[] arr = {'a', 'e', 'i', 'o', 'a', 'u', 'a', 'e', 'i'};
    for(int i=0;i<arr.length;i++)
    { int count=0;
        if(arr[i]!='0')
        {for(int j=i+1;j<arr.length;j++)
           {
                  if(arr[i]==arr[j])
                  {
                     count=count+1;
                     arr[j]='0';
                   }

          }
          if(count>0)
          {System.out.println(arr[i]);}
        }
    }
}
