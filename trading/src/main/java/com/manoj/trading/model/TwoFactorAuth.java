package com.manoj.trading.model;

import com.manoj.trading.domain.VerificatioType;

import lombok.Data;

@Data
public class TwoFactorAuth {
	private boolean isEnabled;
	private VerificatioType sendTo;
}
