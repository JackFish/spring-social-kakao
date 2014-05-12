package org.springframework.social.kakao.api.user;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class KakaoUserProfile {

	@JsonProperty("id")
	private Integer		id;

	@JsonProperty("properties")
	private Properties	properties	= new Properties();

	public Integer getId() {
		return id;
	}

	public String getNickname() {
		return getProperties().getNickname();
	}

	public String getThumbnail() {
		return getProperties().getThumbnail();
	}

	public String getProfile() {
		return getProperties().getProfile();
	}

	public Properties getProperties() {
		return properties;
	}

	@JsonAutoDetect
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Properties {

		@JsonProperty("nickname")
		private String	nickname;

		@JsonProperty("thumbnail_image")
		private String	thumbnail;

		@JsonProperty("profile_image")
		private String	profile;

		public String getNickname() {
			return nickname;
		}

		public String getProfile() {
			return profile;
		}

		public String getThumbnail() {
			return thumbnail;
		}
	}

}