package students;

/**
 * @author merry
 */
public class Student
{
	private String stuID;
	private String classification;
	private String name;
	private double gpa;
	/**
	 * Constructs a student object with student id, classification,
	 * name, and gpa passed as arguments.
	 * @param stuID The student id for this student.
	 * @param classification The classification of this student.
	 * @param name The full name of this student.
	 * @param gpa The gpa of this student.
	 */
	public Student(String stuID, String classification,
		String name, double gpa)
	{
		this.stuID = stuID;
		this.classification = classification;
		this.name = name;
		this.gpa = gpa;
	}
	/**
	 * Returns the first name of this student.
	 * @return The first name of this student.
	 */
	public String getFirstName()
	{
		if (name.indexOf(" ") == -1)
		{
			return name;
		} else
		{
			return name.substring(0, name.indexOf(" "));
		}
	}
	/**
	 * Returns the first name, in reverse order.
	 * For example, if the name is Bruce Willis, it
	 * returns ecurB
	 * @return The first name, with characters in reverse order.
	 */
	public String getFirstNameReversed()
	{
		String firstName = this.getFirstName();
		String firstNameReversed = "";
		for (int i = 0; i < firstName.length(); i++)
		{
			firstNameReversed += firstName.charAt(
				firstName.length() - 1 - i);
		}
		return firstNameReversed;
	}
	/**
	 * Returns the number of words in the name of this student.
	 * A student name consists of at least one word and possibly
	 * more.  Words in a name are separated by a single space.
	 * There are no leading or trailing spaces in a name.
	 * @return The number of words in the name of this student.
	 */
	public int getNameCount()
	{
		int nameCount = 1;
		String tempName = name;
		while (tempName.indexOf(" ") != -1)
		{
			nameCount++;
			tempName = tempName.substring(tempName.indexOf(" ") + 1);
		}
		return nameCount;
	}
	/**
	 * Gets the word in the name in the position indicated, using
	 * 0-based numbering.  For example, if the name is Bruce Willis,
	 * Bruce is in position 0 and Willis is in position 1.
	 * If the argument sent as position is larger than the maximum
	 * position of any word, then NONE is returned.
	 * @param position The position of the word we are searching for.
	 * @return The word in the name in the position indicated by
	 * the parameter. Assume 0-based numbering of words in a name.
	 */
	public String getName(int position)
	{
		String str = "";
		if (position > this.getNameCount() - 1)
		{
			return "NONE";
		} else
		{
			str = name;
			for (int i = 0; i < position; i++)
			{
				if (str.indexOf(" ") != -1)
				{
					str = str.substring(str.indexOf(" ") + 1);
				}
			}
			if (str.indexOf(" ") == -1)
			{
				return str;
			} else
			{
				return str.substring(0, str.indexOf(" "));
			}
		}
	}
	/**
	 * Returns a String representation of this student, with student
	 * id, followed by gpa, followed by classification, followed
	 * by full name.
	 * The student id should be left justified in a field of length 5;
	 * the gpa should be right justified in a field of width 4, with
	 * two decimal places; the classification should be left
	 * justified in a field of width 11; the name should be left
	 * justified in a field of width 32.
	 * @return a String representation of this student.
	 */
	@Override
	public String toString()
	{
		return String.format("%-5s%4.2f%-11s%-32s",
			stuID, gpa, classification, name);
	}
}
