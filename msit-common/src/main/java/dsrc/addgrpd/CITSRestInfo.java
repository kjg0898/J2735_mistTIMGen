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
 * Define the ASN1 Type CITSRestInfo from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSRestInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSRestInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSRestInfo(CITSStationDetail restinfo, CITSstationinfo gas, 
		    CITSelectric electric, CITSParking parking)
    {
	setRestinfo(restinfo);
	setGas(gas);
	setElectric(electric);
	setParking(parking);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CITSStationDetail();
	mComponents[1] = new CITSstationinfo();
	mComponents[2] = new CITSelectric();
	mComponents[3] = new CITSParking();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CITSStationDetail();
	    case 1:
		return new CITSstationinfo();
	    case 2:
		return new CITSelectric();
	    case 3:
		return new CITSParking();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "restinfo"
    public CITSStationDetail getRestinfo()
    {
	return (CITSStationDetail)mComponents[0];
    }
    
    public void setRestinfo(CITSStationDetail restinfo)
    {
	mComponents[0] = restinfo;
    }
    
    public boolean hasRestinfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRestinfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "gas"
    public CITSstationinfo getGas()
    {
	return (CITSstationinfo)mComponents[1];
    }
    
    public void setGas(CITSstationinfo gas)
    {
	mComponents[1] = gas;
    }
    
    public boolean hasGas()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGas()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "electric"
    public CITSelectric getElectric()
    {
	return (CITSelectric)mComponents[2];
    }
    
    public void setElectric(CITSelectric electric)
    {
	mComponents[2] = electric;
    }
    
    public boolean hasElectric()
    {
	return componentIsPresent(2);
    }
    
    public void deleteElectric()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "parking"
    public CITSParking getParking()
    {
	return (CITSParking)mComponents[3];
    }
    
    public void setParking(CITSParking parking)
    {
	mComponents[3] = parking;
    }
    
    public boolean hasParking()
    {
	return componentIsPresent(3);
    }
    
    public void deleteParking()
    {
	setComponentAbsent(3);
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
	    "CITSRestInfo"
	),
	new QName (
	    "AddGrpD",
	    "CITSRestInfo"
	),
	274450,
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
		    "restinfo",
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
				"CITSstationinfo"
			    ),
			    new QName (
				"AddGrpD",
				"CITSstationinfo"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSstationinfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSstationinfo"
				)
			    ),
			    0
			)
		    ),
		    "gas",
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
				"CITSelectric"
			    ),
			    new QName (
				"AddGrpD",
				"CITSelectric"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSelectric"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSelectric"
				)
			    ),
			    0
			)
		    ),
		    "electric",
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
				"CITSParking"
			    ),
			    new QName (
				"AddGrpD",
				"CITSParking"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSParking"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSParking"
				)
			    ),
			    0
			)
		    ),
		    "parking",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSRestInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSRestInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSRestInfo
