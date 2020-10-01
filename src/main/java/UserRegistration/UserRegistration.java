package UserRegistration;

public class UserRegistration {
	
	@FunctionalInterface
	interface validateUserInputs
	{
		boolean Validity(String input);
	}
	public String message;
	public boolean checkFirstName(String firstName) throws CustomException
	{
		if(firstName.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		validateUserInputs check = (fn) -> PatternDeclarations.matchPattern(PatternDeclarations.firstNamePattern, firstName);
		if(check.Validity(firstName))
		{	
			System.out.println("Proceed");
			return true;
		}	
		else 
			throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid First Name!!!");
	}	
	
	public boolean checkLastName(String lastName) throws CustomException
	{
		if(lastName.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		validateUserInputs check = (ln) -> PatternDeclarations.matchPattern(PatternDeclarations.lastNamePattern, lastName);
		if(check.Validity(lastName))
		{	
			System.out.println("Proceed");
			return true;
		}	
		else 
			throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Last Name!!!");
	}	

	public boolean checkEmail(String email) throws CustomException
	{
		if(email.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		validateUserInputs check = (em) -> PatternDeclarations.matchPattern(PatternDeclarations.emailPattern, email);
		if(check.Validity(email))
		{	
			System.out.println("Proceed");
			return true;
		}	
		else 
			throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Email ID!!!");
	}	

	public boolean checkPhoneNumber(String phoneNumber) throws CustomException
	{
		if(phoneNumber.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		validateUserInputs check = (ph) -> PatternDeclarations.matchPattern(PatternDeclarations.phoneNumberPattern, phoneNumber);
		if(check.Validity(phoneNumber))
		{	
			System.out.println("Proceed");
			return true;
		}	
		else 
			throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Phone Number!!!");
	}	

	public boolean checkPassword(String password) throws CustomException
	{
		if(password.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		validateUserInputs check = (pw) -> PatternDeclarations.matchPattern(PatternDeclarations.passwordPattern, password);
		if(check.Validity(password))
		{	
			System.out.println("Proceed");
			return true;
		}	
		else 
			throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Password!!");
	}
}