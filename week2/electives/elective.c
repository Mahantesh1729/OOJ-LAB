#include <stdio.h>
#include <string.h>

typedef struct
{
	char name[50];
	char course[50];
}student;

int main()
{
	int n;
	printf("Enter the number of students: ");
	scanf("%d", &n);
	
	printf("Select any of the three courses:\n\n");
	
	student s[n];
	int choice;
	int iot = 0;
	int ajj = 0;
	int ads = 0;
	char s1[] = "Internet of Things";
	char s2[] = "Advanced Java and J2EE";
	char s3[] = "Advanced Data Structures";
	
	for(int i = 0; i < n; i++)
	{
		printf("1.Internet of Things \n2.Advanced Java and J2EE \n3.Advanced Data Structures\n\n");
		printf("Enter your name: ");
		
		scanf("%s", s[i].name);
		
		printf("Select any of the above courses: \n");
		
		scanf("%d", &choice);
		
		switch(choice)
		{
			case 1: iot++;
					strcpy(s[i].course, s1);
					break;	
			case 2: ajj++;
					strcpy(s[i].course, s2);
					break;
			case 3: ads++;
					strcpy(s[i].course, s3);
					break;
			default: printf("You've not entered an invalid choice\n");
		}
	}
	printf("Total number of students opted for Internet of Things: %d\n", iot);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s1) == 0)
		printf("%s\n", s[i].name);		
	}
	
	printf("List of students opted for Advanced Java and J2EE: %d\n", ajj);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s2) == 0)
		printf("%s\n", s[i].name);		
	}	
	
	printf("List of students opted for Advanced Data Structures: %d\n", ads);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s3) == 0)
		printf("%s\n", s[i].name);		
	}
	
	if((iot < (ajj < ads ? ajj : ads) ? iot : (ajj < ads ? ajj : ads)) == iot)
	{
		for(int i = 0;i < n; i++)
		if(strcmp(s[i].course, s1) == 0)
		{
			printf("%s please choose other two course as the requested course cannot be floated\n", s[i].name);
			
			printf("2.Advanced Java and J2EE \n3.Advanced Data Structures\n\n");
			printf("Enter your choice\n");
			scanf("%d", &choice);
			iot--;
			switch(choice)
			{
				case 2: ajj++;
						strcpy(s[i].course, s2);
						break;
				case 3: ads++;
						strcpy(s[i].course, s3);
						break;
				default: printf("You've not entered an invalid choice\n");
			}	
		}
	}
	if((iot < (ajj < ads ? ajj : ads) ? iot : (ajj < ads ? ajj : ads)) == ajj)
	{
		for(int i = 0;i < n; i++)
		{	
			if(strcmp(s[i].course, s2) == 0)
			{
				printf("%s please choose other two course as the requested course cannot be floated\n", s[i].name);
				
				printf("1.Internet of Things\n3.Advanced Data Structures\n\n");
				printf("Enter your choice\n");
				scanf("%d", &choice);
				ajj--;
				switch(choice)
				{
					case 1: iot++;
							strcpy(s[i].course, s1);
							break;					
					case 3: ads++;
							strcpy(s[i].course, s3);
							break;
					default: printf("You've not entered an invalid choice\n");
				}	
			}
		}	
	}	
	if((iot < (ajj < ads ? ajj : ads) ? iot : (ajj < ads ? ajj : ads)) == ads)
	{
		for(int i = 0;i < n; i++)
		{
			if(strcmp(s[i].course, s3) == 0)
			{
				printf("%s please choose other two course as the requested course cannot be floated\n", s[i].name);
				
				printf("1.Internet of Things\n2.Advanced Java and J2EE\n\n");
				printf("Enter your choice\n");
				scanf("%d", &choice);
				
				ads--;
				switch(choice)
				{
					case 1: iot++;
							strcpy(s[i].course, s1);
							break;	
					case 2: ajj++;
							strcpy(s[i].course, s2);
							break;				
					
					default: printf("You've not entered an invalid choice\n");
				}	
			}
		}
	}
	printf("**********************After reselection**************\n");
	printf("Total number of students opted for Internet of Things: %d\n", iot);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s1) == 0)
		printf("%s\n", s[i].name);		
	}
	
	printf("List of students opted for Advanced Java and J2EE: %d\n", ajj);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s2) == 0)
		printf("%s\n", s[i].name);		
	}	
	
	printf("List of students opted for Advanced Data Structures: %d\n", ads);
	for(int i = 0; i < n; i++)
	{
		if(strcmp(s[i].course, s3) == 0)
		printf("%s\n", s[i].name);		
	}
	
}














