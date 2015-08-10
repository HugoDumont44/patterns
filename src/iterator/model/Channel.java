package iterator.model;

public class Channel {
	private String name;
	private ChannelTypeEnum TYPE;
	
	public Channel(String name, ChannelTypeEnum type) {
		this.name = name;
		this.TYPE = type;
	}

	public String getName() {
		return name;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Frequency = "+this.name+", Type = "+this.TYPE;
	}
	
}
