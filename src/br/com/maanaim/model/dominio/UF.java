package br.com.maanaim.model.dominio;

public enum UF {  
    
  AC ("Acre"),  
  AL ("Alagoas"),  
  AM ("Amazonas"),  
  AP ("Amap�"),  
  BA ("Bahia"),  
  CE ("Cear�"),  
  DF ("Distrito Federal"),  
  ES ("Espirito Santo"),  
  GO ("Goi�s"),  
  MA ("Maranh�o"),  
  MG ("Minas Gerais"),  
  MS ("Mato Grosso do Sul"),  
  MT ("Mato Grosso"),  
  PA ("Par�"),  
  PB ("Para�ba"),  
  PE ("Pernambuco"),  
  PI ("Piau�"),  
  PR ("Paran�"),  
  RJ ("Rio de Janeiro"),  
  RN ("Rio Grande do Norte"),  
  RO ("Rond�nia"),  
  RR ("Roraima"),  
  RS ("Rio Grande do Sul"),  
  SC ("Santa Catarina"),  
  SE ("Sergipe"),  
  SP ("S�o Paulo"),  
  TO ("Tocantins");  

  private final String nome;  
    
  UF (String nome){  
      this.nome = nome;  
  }  
    
  public String getNome(){  
      return nome;  
  }
  
}