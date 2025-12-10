//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    char[] arr={'a','e','i','o','a','u','a','e','i'};
    for(int i=0;i< arr.length;i++)
    {
      if(arr[i]!='0') {


            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    arr[i] = '0';
                    arr[j]='0';
                }
            }
        }
    }

}
