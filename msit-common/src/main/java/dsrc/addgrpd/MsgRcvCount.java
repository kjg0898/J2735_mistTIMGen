/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.addgrpd;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type MsgRcvCount from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class MsgRcvCount extends Sequence {
    
    /**
     * The default constructor.
     */
    public MsgRcvCount()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MsgRcvCount(INTEGER rBSM_WAVECV2X, INTEGER rSPAT_WAVECV2X, 
		    INTEGER rRTCM_WAVECV2X, INTEGER rMAP_WAVECV2X, 
		    INTEGER rRSA_WAVECV2X, INTEGER rTIM_WAVECV2X, 
		    INTEGER rSPAT_5GLTE, INTEGER rRTCM_5GLTE, 
		    INTEGER rMAP_5GLTE, INTEGER rRSA_5GLTE, 
		    INTEGER rTIM_5GLTE, INTEGER rDisplay, INTEGER rOutVehicle, 
		    INTEGER rInVehicle, INTEGER rADAS, INTEGER rDrowsy)
    {
	setRBSM_WAVECV2X(rBSM_WAVECV2X);
	setRSPAT_WAVECV2X(rSPAT_WAVECV2X);
	setRRTCM_WAVECV2X(rRTCM_WAVECV2X);
	setRMAP_WAVECV2X(rMAP_WAVECV2X);
	setRRSA_WAVECV2X(rRSA_WAVECV2X);
	setRTIM_WAVECV2X(rTIM_WAVECV2X);
	setRSPAT_5GLTE(rSPAT_5GLTE);
	setRRTCM_5GLTE(rRTCM_5GLTE);
	setRMAP_5GLTE(rMAP_5GLTE);
	setRRSA_5GLTE(rRSA_5GLTE);
	setRTIM_5GLTE(rTIM_5GLTE);
	setRDisplay(rDisplay);
	setROutVehicle(rOutVehicle);
	setRInVehicle(rInVehicle);
	setRADAS(rADAS);
	setRDrowsy(rDrowsy);
    }
    
    /**
     * Construct with components.
     */
    public MsgRcvCount(long rBSM_WAVECV2X, long rSPAT_WAVECV2X, 
		    long rRTCM_WAVECV2X, long rMAP_WAVECV2X, 
		    long rRSA_WAVECV2X, long rTIM_WAVECV2X, long rSPAT_5GLTE, 
		    long rRTCM_5GLTE, long rMAP_5GLTE, long rRSA_5GLTE, 
		    long rTIM_5GLTE, long rDisplay, long rOutVehicle, 
		    long rInVehicle, long rADAS, long rDrowsy)
    {
	this(new INTEGER(rBSM_WAVECV2X), new INTEGER(rSPAT_WAVECV2X), 
	     new INTEGER(rRTCM_WAVECV2X), new INTEGER(rMAP_WAVECV2X), 
	     new INTEGER(rRSA_WAVECV2X), new INTEGER(rTIM_WAVECV2X), 
	     new INTEGER(rSPAT_5GLTE), new INTEGER(rRTCM_5GLTE), 
	     new INTEGER(rMAP_5GLTE), new INTEGER(rRSA_5GLTE), 
	     new INTEGER(rTIM_5GLTE), new INTEGER(rDisplay), 
	     new INTEGER(rOutVehicle), new INTEGER(rInVehicle), 
	     new INTEGER(rADAS), new INTEGER(rDrowsy));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = new INTEGER();
	mComponents[10] = new INTEGER();
	mComponents[11] = new INTEGER();
	mComponents[12] = new INTEGER();
	mComponents[13] = new INTEGER();
	mComponents[14] = new INTEGER();
	mComponents[15] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return new INTEGER();
	    case 10:
		return new INTEGER();
	    case 11:
		return new INTEGER();
	    case 12:
		return new INTEGER();
	    case 13:
		return new INTEGER();
	    case 14:
		return new INTEGER();
	    case 15:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rBSM_WAVECV2X"
    public long getRBSM_WAVECV2X()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setRBSM_WAVECV2X(long rBSM_WAVECV2X)
    {
	setRBSM_WAVECV2X(new INTEGER(rBSM_WAVECV2X));
    }
    
    public void setRBSM_WAVECV2X(INTEGER rBSM_WAVECV2X)
    {
	mComponents[0] = rBSM_WAVECV2X;
    }
    
    
    // Methods for field "rSPAT_WAVECV2X"
    public long getRSPAT_WAVECV2X()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRSPAT_WAVECV2X(long rSPAT_WAVECV2X)
    {
	setRSPAT_WAVECV2X(new INTEGER(rSPAT_WAVECV2X));
    }
    
    public void setRSPAT_WAVECV2X(INTEGER rSPAT_WAVECV2X)
    {
	mComponents[1] = rSPAT_WAVECV2X;
    }
    
    
    // Methods for field "rRTCM_WAVECV2X"
    public long getRRTCM_WAVECV2X()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRRTCM_WAVECV2X(long rRTCM_WAVECV2X)
    {
	setRRTCM_WAVECV2X(new INTEGER(rRTCM_WAVECV2X));
    }
    
    public void setRRTCM_WAVECV2X(INTEGER rRTCM_WAVECV2X)
    {
	mComponents[2] = rRTCM_WAVECV2X;
    }
    
    
    // Methods for field "rMAP_WAVECV2X"
    public long getRMAP_WAVECV2X()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setRMAP_WAVECV2X(long rMAP_WAVECV2X)
    {
	setRMAP_WAVECV2X(new INTEGER(rMAP_WAVECV2X));
    }
    
    public void setRMAP_WAVECV2X(INTEGER rMAP_WAVECV2X)
    {
	mComponents[3] = rMAP_WAVECV2X;
    }
    
    
    // Methods for field "rRSA_WAVECV2X"
    public long getRRSA_WAVECV2X()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setRRSA_WAVECV2X(long rRSA_WAVECV2X)
    {
	setRRSA_WAVECV2X(new INTEGER(rRSA_WAVECV2X));
    }
    
    public void setRRSA_WAVECV2X(INTEGER rRSA_WAVECV2X)
    {
	mComponents[4] = rRSA_WAVECV2X;
    }
    
    
    // Methods for field "rTIM_WAVECV2X"
    public long getRTIM_WAVECV2X()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setRTIM_WAVECV2X(long rTIM_WAVECV2X)
    {
	setRTIM_WAVECV2X(new INTEGER(rTIM_WAVECV2X));
    }
    
    public void setRTIM_WAVECV2X(INTEGER rTIM_WAVECV2X)
    {
	mComponents[5] = rTIM_WAVECV2X;
    }
    
    
    // Methods for field "rSPAT_5GLTE"
    public long getRSPAT_5GLTE()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setRSPAT_5GLTE(long rSPAT_5GLTE)
    {
	setRSPAT_5GLTE(new INTEGER(rSPAT_5GLTE));
    }
    
    public void setRSPAT_5GLTE(INTEGER rSPAT_5GLTE)
    {
	mComponents[6] = rSPAT_5GLTE;
    }
    
    
    // Methods for field "rRTCM_5GLTE"
    public long getRRTCM_5GLTE()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setRRTCM_5GLTE(long rRTCM_5GLTE)
    {
	setRRTCM_5GLTE(new INTEGER(rRTCM_5GLTE));
    }
    
    public void setRRTCM_5GLTE(INTEGER rRTCM_5GLTE)
    {
	mComponents[7] = rRTCM_5GLTE;
    }
    
    
    // Methods for field "rMAP_5GLTE"
    public long getRMAP_5GLTE()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setRMAP_5GLTE(long rMAP_5GLTE)
    {
	setRMAP_5GLTE(new INTEGER(rMAP_5GLTE));
    }
    
    public void setRMAP_5GLTE(INTEGER rMAP_5GLTE)
    {
	mComponents[8] = rMAP_5GLTE;
    }
    
    
    // Methods for field "rRSA_5GLTE"
    public long getRRSA_5GLTE()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void setRRSA_5GLTE(long rRSA_5GLTE)
    {
	setRRSA_5GLTE(new INTEGER(rRSA_5GLTE));
    }
    
    public void setRRSA_5GLTE(INTEGER rRSA_5GLTE)
    {
	mComponents[9] = rRSA_5GLTE;
    }
    
    
    // Methods for field "rTIM_5GLTE"
    public long getRTIM_5GLTE()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setRTIM_5GLTE(long rTIM_5GLTE)
    {
	setRTIM_5GLTE(new INTEGER(rTIM_5GLTE));
    }
    
    public void setRTIM_5GLTE(INTEGER rTIM_5GLTE)
    {
	mComponents[10] = rTIM_5GLTE;
    }
    
    
    // Methods for field "rDisplay"
    public long getRDisplay()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }
    
    public void setRDisplay(long rDisplay)
    {
	setRDisplay(new INTEGER(rDisplay));
    }
    
    public void setRDisplay(INTEGER rDisplay)
    {
	mComponents[11] = rDisplay;
    }
    
    
    // Methods for field "rOutVehicle"
    public long getROutVehicle()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setROutVehicle(long rOutVehicle)
    {
	setROutVehicle(new INTEGER(rOutVehicle));
    }
    
    public void setROutVehicle(INTEGER rOutVehicle)
    {
	mComponents[12] = rOutVehicle;
    }
    
    
    // Methods for field "rInVehicle"
    public long getRInVehicle()
    {
	return ((INTEGER)mComponents[13]).longValue();
    }
    
    public void setRInVehicle(long rInVehicle)
    {
	setRInVehicle(new INTEGER(rInVehicle));
    }
    
    public void setRInVehicle(INTEGER rInVehicle)
    {
	mComponents[13] = rInVehicle;
    }
    
    
    // Methods for field "rADAS"
    public long getRADAS()
    {
	return ((INTEGER)mComponents[14]).longValue();
    }
    
    public void setRADAS(long rADAS)
    {
	setRADAS(new INTEGER(rADAS));
    }
    
    public void setRADAS(INTEGER rADAS)
    {
	mComponents[14] = rADAS;
    }
    
    
    // Methods for field "rDrowsy"
    public long getRDrowsy()
    {
	return ((INTEGER)mComponents[15]).longValue();
    }
    
    public void setRDrowsy(long rDrowsy)
    {
	setRDrowsy(new INTEGER(rDrowsy));
    }
    
    public void setRDrowsy(INTEGER rDrowsy)
    {
	mComponents[15] = rDrowsy;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.addgrpd",
	    "MsgRcvCount"
	),
	new QName (
	    "AddGrpD",
	    "MsgRcvCount"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rBSM_WAVECV2X",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rSPAT_WAVECV2X",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rRTCM_WAVECV2X",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rMAP_WAVECV2X",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rRSA_WAVECV2X",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rTIM_WAVECV2X",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rSPAT_5GLTE",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rRTCM_5GLTE",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rMAP_5GLTE",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rRSA_5GLTE",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rTIM_5GLTE",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rDisplay",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rOutVehicle",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rInVehicle",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rADAS",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "rDrowsy",
		    15,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MsgRcvCount object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MsgRcvCount object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MsgRcvCount
