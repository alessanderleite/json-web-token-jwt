package br.com.alessanderleite.app.message.response;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	
	public JwtResponse(String accessToken) {
		super();
		this.token = accessToken;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setType(String tokenType) {
		this.type = tokenType;
	}
}
