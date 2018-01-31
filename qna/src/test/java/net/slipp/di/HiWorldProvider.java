package net.slipp.di;

public class HiWorldProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hi World";
	}

}
