package com.nt.service;

import com.nt.external.ScoreComp;

public class FindScoreServiceImpl implements FindScoreService {
	//inject externa service here
private ScoreComp extscore;

	public void setExtscore(ScoreComp extscore) {
	this.extscore = extscore;
}

	@Override
	public String findScore(int matchId) {
//use externa servie component
   String sts=extscore.findScore(matchId);
		return sts;
	}

}
