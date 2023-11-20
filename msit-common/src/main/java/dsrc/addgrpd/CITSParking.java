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
 * Define the ASN1 Type CITSParking from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSParking extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSParking()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSParking(INTEGER parkinglot_id, CITSStationDetail normal, 
		    CITSStationDetail disable, CITSStationDetail big, 
		    CITSStationDetail compact, CITSStationDetail emergency, 
		    CITSStationDetail women, CITSStationDetail etc)
    {
	setParkinglot_id(parkinglot_id);
	setNormal(normal);
	setDisable(disable);
	setBig(big);
	setCompact(compact);
	setEmergency(emergency);
	setWomen(women);
	setEtc(etc);
    }
    
    /**
     * Construct with components.
     */
    public CITSParking(long parkinglot_id, CITSStationDetail normal, 
		    CITSStationDetail disable, CITSStationDetail big, 
		    CITSStationDetail compact, CITSStationDetail emergency, 
		    CITSStationDetail women, CITSStationDetail etc)
    {
	this(new INTEGER(parkinglot_id), normal, disable, big, compact, 
	     emergency, women, etc);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new CITSStationDetail();
	mComponents[2] = new CITSStationDetail();
	mComponents[3] = new CITSStationDetail();
	mComponents[4] = new CITSStationDetail();
	mComponents[5] = new CITSStationDetail();
	mComponents[6] = new CITSStationDetail();
	mComponents[7] = new CITSStationDetail();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new CITSStationDetail();
	    case 2:
		return new CITSStationDetail();
	    case 3:
		return new CITSStationDetail();
	    case 4:
		return new CITSStationDetail();
	    case 5:
		return new CITSStationDetail();
	    case 6:
		return new CITSStationDetail();
	    case 7:
		return new CITSStationDetail();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "parkinglot_id"
    public long getParkinglot_id()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setParkinglot_id(long parkinglot_id)
    {
	setParkinglot_id(new INTEGER(parkinglot_id));
    }
    
    public void setParkinglot_id(INTEGER parkinglot_id)
    {
	mComponents[0] = parkinglot_id;
    }
    
    
    // Methods for field "normal"
    public CITSStationDetail getNormal()
    {
	return (CITSStationDetail)mComponents[1];
    }
    
    public void setNormal(CITSStationDetail normal)
    {
	mComponents[1] = normal;
    }
    
    
    // Methods for field "disable"
    public CITSStationDetail getDisable()
    {
	return (CITSStationDetail)mComponents[2];
    }
    
    public void setDisable(CITSStationDetail disable)
    {
	mComponents[2] = disable;
    }
    
    
    // Methods for field "big"
    public CITSStationDetail getBig()
    {
	return (CITSStationDetail)mComponents[3];
    }
    
    public void setBig(CITSStationDetail big)
    {
	mComponents[3] = big;
    }
    
    
    // Methods for field "compact"
    public CITSStationDetail getCompact()
    {
	return (CITSStationDetail)mComponents[4];
    }
    
    public void setCompact(CITSStationDetail compact)
    {
	mComponents[4] = compact;
    }
    
    
    // Methods for field "emergency"
    public CITSStationDetail getEmergency()
    {
	return (CITSStationDetail)mComponents[5];
    }
    
    public void setEmergency(CITSStationDetail emergency)
    {
	mComponents[5] = emergency;
    }
    
    
    // Methods for field "women"
    public CITSStationDetail getWomen()
    {
	return (CITSStationDetail)mComponents[6];
    }
    
    public void setWomen(CITSStationDetail women)
    {
	mComponents[6] = women;
    }
    
    
    // Methods for field "etc"
    public CITSStationDetail getEtc()
    {
	return (CITSStationDetail)mComponents[7];
    }
    
    public void setEtc(CITSStationDetail etc)
    {
	mComponents[7] = etc;
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
	    "CITSParking"
	),
	new QName (
	    "AddGrpD",
	    "CITSParking"
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
				    new INTEGER(99999999),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(99999999)
			    ),
			    null
			)
		    ),
		    "parkinglot-id",
		    0,
		    2,
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
		    "normal",
		    1,
		    2,
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
		    "disable",
		    2,
		    2,
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
		    "big",
		    3,
		    2,
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
		    "compact",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "emergency",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "women",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "etc",
		    7,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CITSParking object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSParking object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSParking
