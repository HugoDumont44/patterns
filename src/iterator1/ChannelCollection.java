package iterator1;

import iterator.model.*;

public interface ChannelCollection {
	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
}
