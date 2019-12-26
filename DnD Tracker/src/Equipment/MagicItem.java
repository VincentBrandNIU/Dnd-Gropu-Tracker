package Equipment;
/**
 * @author Jakob Brand
 *Extends equipment for magical items
 */
public class MagicItem extends Equipment
{
	private String affect;
	private String parameter;
	
	public MagicItem() {
		
	}

	public String getAffect()
	{
		return affect;
	}

	public void setAffect(String affect)
	{
		this.affect = affect;
	}

	public String getParameter()
	{
		return parameter;
	}

	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}
	
}
