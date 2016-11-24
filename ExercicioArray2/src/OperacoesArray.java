
public class OperacoesArray {
    
    int tamanhoTotal = 4;
    int[] ArrayInteiro = {1,2,3,4,5};
    

    int remover(){
        int valorAnterior = ArrayInteiro[tamanhoTotal];        
        ArrayInteiro[tamanhoTotal] = 0;
        return valorAnterior;
    }
    
    boolean inserirNoInicio(int valor){
    	if(ArrayInteiro[tamanhoTotal]==0){
        	return false;
        }
        else{
        	int temp;            
             for(int i=0;i<tamanhoTotal;i++){
            	 temp = ArrayInteiro[i];
                 ArrayInteiro[i] = temp;
                 
             }
             ArrayInteiro[0] = valor;
             return true;
        }
    }
    
    void imprimirLista(){
        if(ArrayInteiro[tamanhoTotal-tamanhoTotal]==0){
            System.out.println("Array está vazio");
        }
        else{
            for(int i=0;i<=tamanhoTotal;i++){
                System.out.println(ArrayInteiro[i]);                        
            }
        }
    }
    
}
