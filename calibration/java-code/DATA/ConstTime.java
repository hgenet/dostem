package DATA;

import TEMJNI.temcore;

public class ConstTime{
	public final static int DYINY = temcore.getDYINY();  // DINY is not used
	public final static int MINY  = temcore.getMINY();	
	
	public final static int MAX_CO2_DRV_YR =temcore.getMAX_CO2_DRV_YR(); // maximum number of years of atmopsheric CO2 data
	public final static int MAX_ATM_DRV_YR =temcore.getMAX_ATM_DRV_YR(); // maximum number of years of atmopsheric driving data
	
	public final static int BEG_SP_YR = temcore.getBEG_SP_YR(); // starting year of spin-up
	public final static int END_SP_YR = temcore.getEND_SP_YR(); // ending year of spin-up
	public final static int BEG_TR_YR = temcore.getBEG_TR_YR(); // starting year of transient
	public final static int END_TR_YR = temcore.getEND_TR_YR(); // endting year of transient
	public final static int BEG_SC_YR = temcore.getBEG_SC_YR(); // starting year of scenario
	public final static int END_SC_YR = temcore.getEND_SC_YR(); // ending year of scenario
	
	public final static int MAX_EQ_YR = temcore.getMAX_EQ_YR(); // maximum number of years of equilibrium run
	public final static int MAX_SP_YR = temcore.getMAX_SP_YR(); // maximum number of years of spinup run;
	public final static int MAX_TR_YR = temcore.getMAX_TR_YR(); // maximum number of years of transient run;
	public final static int MAX_FSIZE_DRV_YR    = temcore.getMAX_FSIZE_DRV_YR(); // maximum number of years of fire size history;
	
	public final static int MAX_TR_FIR_OCR_NUM =temcore.getMAX_TR_FIR_OCR_NUM(); // maximum number of fire occurrence in transient run
	public final static int MAX_SP_FIR_OCR_NUM =temcore.getMAX_SP_FIR_OCR_NUM(); // maximum number of fire occurrence in trainsient run

	public final static int dinm[] = {31,  28,  31,  30,  31,  30,  31,  31,  30,  31,  30,  31};
	public final static int doyindfst[] ={ 0,  31,  59,  90, 120, 151, 181, 212, 243, 273, 304, 334};
}


