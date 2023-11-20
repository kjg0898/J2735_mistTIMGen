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


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleStatusRequest from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleStatusRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleStatusRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    INTEGER subType, INTEGER sendOnLessThenValue, 
		    INTEGER sendOnMoreThenValue, BOOLEAN sendAll)
    {
	setDataType(dataType);
	setSubType(subType);
	setSendOnLessThenValue(sendOnLessThenValue);
	setSendOnMoreThenValue(sendOnMoreThenValue);
	setSendAll(sendAll);
    }
    
    /**
     * Construct with components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType, 
		    long subType, long sendOnLessThenValue, 
		    long sendOnMoreThenValue, boolean sendAll)
    {
	this(dataType, new INTEGER(subType), 
	     new INTEGER(sendOnLessThenValue), 
	     new INTEGER(sendOnMoreThenValue), new BOOLEAN(sendAll));
    }
    
    /**
     * Construct with required components.
     */
    public VehicleStatusRequest(VehicleStatusDeviceTypeTag dataType)
    {
	setDataType(dataType);
    }
    
    public void initComponents()
    {
	mComponents[0] = VehicleStatusDeviceTypeTag.unknown;
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new BOOLEAN();
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
		return VehicleStatusDeviceTypeTag.unknown;
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dataType"
    public VehicleStatusDeviceTypeTag getDataType()
    {
	return (VehicleStatusDeviceTypeTag)mComponents[0];
    }
    
    public void setDataType(VehicleStatusDeviceTypeTag dataType)
    {
	mComponents[0] = dataType;
    }
    
    
    // Methods for field "subType"
    public long getSubType()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setSubType(long subType)
    {
	setSubType(new INTEGER(subType));
    }
    
    public void setSubType(INTEGER subType)
    {
	mComponents[1] = subType;
    }
    
    public boolean hasSubType()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSubType()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "sendOnLessThenValue"
    public long getSendOnLessThenValue()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setSendOnLessThenValue(long sendOnLessThenValue)
    {
	setSendOnLessThenValue(new INTEGER(sendOnLessThenValue));
    }
    
    public void setSendOnLessThenValue(INTEGER sendOnLessThenValue)
    {
	mComponents[2] = sendOnLessThenValue;
    }
    
    public boolean hasSendOnLessThenValue()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSendOnLessThenValue()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "sendOnMoreThenValue"
    public long getSendOnMoreThenValue()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setSendOnMoreThenValue(long sendOnMoreThenValue)
    {
	setSendOnMoreThenValue(new INTEGER(sendOnMoreThenValue));
    }
    
    public void setSendOnMoreThenValue(INTEGER sendOnMoreThenValue)
    {
	mComponents[3] = sendOnMoreThenValue;
    }
    
    public boolean hasSendOnMoreThenValue()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSendOnMoreThenValue()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "sendAll"
    public boolean getSendAll()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setSendAll(boolean sendAll)
    {
	setSendAll(new BOOLEAN(sendAll));
    }
    
    public void setSendAll(BOOLEAN sendAll)
    {
	mComponents[4] = sendAll;
    }
    
    public boolean hasSendAll()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSendAll()
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
	    "dsrc.dsrc",
	    "VehicleStatusRequest"
	),
	new QName (
	    "DSRC",
	    "VehicleStatusRequest"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleStatusDeviceTypeTag"
			    ),
			    new QName (
				"DSRC",
				"VehicleStatusDeviceTypeTag"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"lights",
					1
				    ),
				    new MemberListElement (
					"wipers",
					2
				    ),
				    new MemberListElement (
					"brakes",
					3
				    ),
				    new MemberListElement (
					"stab",
					4
				    ),
				    new MemberListElement (
					"trac",
					5
				    ),
				    new MemberListElement (
					"abs",
					6
				    ),
				    new MemberListElement (
					"sunS",
					7
				    ),
				    new MemberListElement (
					"rainS",
					8
				    ),
				    new MemberListElement (
					"airTemp",
					9
				    ),
				    new MemberListElement (
					"steering",
					10
				    ),
				    new MemberListElement (
					"vertAccelThres",
					11
				    ),
				    new MemberListElement (
					"vertAccel",
					12
				    ),
				    new MemberListElement (
					"hozAccelLong",
					13
				    ),
				    new MemberListElement (
					"hozAccelLat",
					14
				    ),
				    new MemberListElement (
					"hozAccelCon",
					15
				    ),
				    new MemberListElement (
					"accel4way",
					16
				    ),
				    new MemberListElement (
					"confidenceSet",
					17
				    ),
				    new MemberListElement (
					"obDist",
					18
				    ),
				    new MemberListElement (
					"obDirect",
					19
				    ),
				    new MemberListElement (
					"yaw",
					20
				    ),
				    new MemberListElement (
					"yawRateCon",
					21
				    ),
				    new MemberListElement (
					"dateTime",
					22
				    ),
				    new MemberListElement (
					"fullPos",
					23
				    ),
				    new MemberListElement (
					"position2D",
					24
				    ),
				    new MemberListElement (
					"position3D",
					25
				    ),
				    new MemberListElement (
					"vehicle",
					26
				    ),
				    new MemberListElement (
					"speedHeadC",
					27
				    ),
				    new MemberListElement (
					"speedC",
					28
				    )
				}
			    ),
			    0,
			    VehicleStatusDeviceTypeTag.unknown
			)
		    ),
		    "dataType",
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
				    new INTEGER(1),
				    new INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "subType",
		    1,
		    3,
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
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "sendOnLessThenValue",
		    2,
		    3,
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
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "sendOnMoreThenValue",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    274450,
			    null
			)
		    ),
		    "sendAll",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' VehicleStatusRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleStatusRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleStatusRequest
