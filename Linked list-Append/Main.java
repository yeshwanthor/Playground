#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
 struct node *next;
};
int main()
{
 struct node *newnode,*head,*last,*t;
 int value=0;
 while(value!=-1)
 {
   scanf("%d",&value);
   newnode=(struct node*)malloc(sizeof(struct node));
     if(value!=-1)
     {
       newnode->data=value;
   
     if(head==0)
     {
       head=newnode;
       last=newnode;
     }
     else
     {
       last->next=newnode;
       last=newnode;
     }
   printf("%d ",last->data);
   }
 
 }
}