#ifndef TIMECONST_H_
#define TIMECONST_H_

	const int DYINY =365;  // DINY does not work
	const int MINY =12;	

	const int MAX_CO2_DRV_YR = 106;   // maximum number of years of CO2 at regional-scale (YUAN);
	const int MAX_ATM_DRV_YR = 106;   // maximum number of years of atmopsheric driving data
	const int MAX_ATM_NOM_YR = 30;    // maximum number of years of NORMAL atmopsheric driving data (YUAN: used for spin-up)

	const int MAX_FSIZE_DRV_YR = 106; // maximum number of years of fire size at regional-scale (YUAN);

	//YUAN: moving the constants in Timer here
	const int MAX_EQ_YR = 10000;  // maximum number of years for equilibrium run
	const int MAX_SP_YR = 900;    // maximum number of years of spinup run;

    const int BEG_TR_YR = 1901;
    const int END_TR_YR = 2006;

    const int BEG_SC_YR = 2007;
    const int END_SC_YR = 2099;

    //YUAN: the following is upon the above and modified from the original definition
    const int END_SP_YR = BEG_TR_YR - 1;
	const int BEG_SP_YR = END_SP_YR - MAX_SP_YR+1;   //NOTE: not -1, which reserved for non fire year

    const int MAX_TR_YR = END_TR_YR-BEG_TR_YR+1; // maximum number of years of transient run;
	const int MAX_SC_YR = END_SC_YR-BEG_SC_YR+1; // maximum number of years of scenario run;
	
	const int MAX_TR_FIR_OCR_NUM = 8; // maximum number of fire occurrence in transient+scenario run
	const int MAX_SP_FIR_OCR_NUM = 15; // maximum number of fire occurrence in spin-up run
	const int MAX_FIR_OCR_NUM    = MAX_SP_FIR_OCR_NUM+MAX_TR_FIR_OCR_NUM; // maximum number of fire occurrence in model run

#endif /*TIMECONST_H_*/
