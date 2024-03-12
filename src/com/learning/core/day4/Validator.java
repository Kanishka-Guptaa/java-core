package com.learning.core.day04;

public class Validator 
{
	public void validate(Applicant applicant) throws CatheyBankException 
	{
        if (!isValidApplicantName(applicant.getApplicantName())) 
        {
            throw new CatheyBankException("Invalid Applicant Name");
        }
        if (!isValidPost(applicant.getPostApplied())) 
        {
            throw new CatheyBankException("Invalid Post");
        }
        if (!isValidAge(applicant.getApplicantAge())) 
        {
            throw new CatheyBankException("Invalid Age");
        }
        System.out.println("All details are valid");
    }

    public boolean isValidApplicantName(String name) 
    {
        return name != null && !name.isEmpty();
    }

    public boolean isValidPost(String post) 
    {
        return post != null && (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer"));
    }

    public boolean isValidAge(int age) 
    {
        return age > 18 && age < 30;
    }		
}
