public class Arraystuff {
    
    public int[] frontPiece(int[] nums) {
	if (nums.length < 3) {
	    return nums;
	} else {
	    int[] retd;
	    retd = new int[2];
	    retd[0] = nums[0];
	    retd[1] = nums[1];
	    return retd;
	}
    }

    public int sum13(int[] nums) {
	int retd = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 13) {
		i++;
	    } else{
		retd = retd + nums[i];
	    }
	}
	return retd;
    }

    public int sum67(int[] nums) {
	int retd = 0;
	for (int i=0; i < nums.length; i++) {
	    if (nums[i] != 6) {
		retd = retd + nums[i];
	    } else {
		while (nums[i] != 7) {
		    i++;
		}
	    }
	}
	return retd;
    }

    public boolean more14(int[] nums) {
	int num1 = 0;
	int num4 = 0;
	for (int i=0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		num1++;
	    } else if (nums[i] == 4) {
		num4++;
	    } else {
	    }
	}
	return (num1 > num4);
  
    }

    public int[] tenRun(int[] nums) {
	int joe = 1;
	for (int i = 0; i< nums.length; i++) {
	    if (nums[i] % 10 == 0) {
		joe = nums[i];
	    } else if (joe == 1) {
	    } else {
		nums[i] = joe;
	    }
	}
	return nums;
    }


    public boolean tripleUp(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	    if (nums.length < 3 || nums.length <= i+2) {
		return false;
	    } else if (nums[i] == nums[i+1] - 1 && nums[i] == nums[i+2] - 2) {
		return true;
	    } else {
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int summa = 0;
	for (int i = 0; i < nums.length; i++) {
	    summa = summa + nums[i];
	}
	//summa is the sum
  
	if (summa % 2 == 0) {
	    int halb = 0;
	    for (int i = 0; i < nums.length; i++) {
		halb = halb + nums[i];
		if (halb == summa/2) {
		    return true;
		}
	    }
	} else {
	    return false;
	}
	return false;
    }


}