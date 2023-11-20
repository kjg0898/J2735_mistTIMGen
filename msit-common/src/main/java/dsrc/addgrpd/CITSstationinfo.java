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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSstationinfo from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSstationinfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSstationinfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSstationinfo(CITSStationDetail gasoline, 
		    CITSStationDetail diesel, CITSStationDetail lpg, 
		    CITSStationDetail premium, CITSStationDetail hydrogen)
    {
	setGasoline(gasoline);
	setDiesel(diesel);
	setLpg(lpg);
	setPremium(premium);
	setHydrogen(hydrogen);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CITSStationDetail();
	mComponents[1] = new CITSStationDetail();
	mComponents[2] = new CITSStationDetail();
	mComponents[3] = new CITSStationDetail();
	mComponents[4] = new CITSStationDetail();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CITSStationDetail();
	    case 1:
		return new CITSStationDetail();
	    case 2:
		return new CITSStationDetail();
	    case 3:
		return new CITSStationDetail();
	    case 4:
		return new CITSStationDetail();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gasoline"
    public CITSStationDetail getGasoline()
    {
	return (CITSStationDetail)mComponents[0];
    }
    
    public void setGasoline(CITSStationDetail gasoline)
    {
	mComponents[0] = gasoline;
    }
    
    public boolean hasGasoline()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGasoline()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "diesel"
    public CITSStationDetail getDiesel()
    {
	return (CITSStationDetail)mComponents[1];
    }
    
    public void setDiesel(CITSStationDetail diesel)
    {
	mComponents[1] = diesel;
    }
    
    public boolean hasDiesel()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDiesel()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "lpg"
    public CITSStationDetail getLpg()
    {
	return (CITSStationDetail)mComponents[2];
    }
    
    public void setLpg(CITSStationDetail lpg)
    {
	mComponents[2] = lpg;
    }
    
    public boolean hasLpg()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLpg()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "premium"
    public CITSStationDetail getPremium()
    {
	return (CITSStationDetail)mComponents[3];
    }
    
    public void setPremium(CITSStationDetail premium)
    {
	mComponents[3] = premium;
    }
    
    public boolean hasPremium()
    {
	return componentIsPresent(3);
    }
    
    public void deletePremium()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "hydrogen"
    public CITSStationDetail getHydrogen()
    {
	return (CITSStationDetail)mComponents[4];
    }
    
    public void setHydrogen(CITSStationDetail hydrogen)
    {
	mComponents[4] = hydrogen;
    }
    
    public boolean hasHydrogen()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHydrogen()
    {
	setComponentAbsent(4);
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
	    "CITSstationinfo"
	),
	new QName (
	    "AddGrpD",
	    "CITSstationinfo"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "gasoline",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "diesel",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "lpg",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "premium",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "hydrogen",
		    4,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSstationinfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSstationinfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSstationinfo
