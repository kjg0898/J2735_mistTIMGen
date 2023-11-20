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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type WeatherReport from ASN1 Module DSRC.
 * @see Sequence
 */

public class WeatherReport extends Sequence {
    
    /**
     * The default constructor.
     */
    public WeatherReport()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WeatherReport(dsrc.ntcip.EssPrecipYesNo isRaining, 
		    dsrc.ntcip.EssPrecipRate rainRate, 
		    dsrc.ntcip.EssPrecipSituation precipSituation, 
		    dsrc.ntcip.EssSolarRadiation solarRadiation, 
		    dsrc.ntcip.EssMobileFriction friction, 
		    CoefficientOfFriction roadFriction)
    {
	setIsRaining(isRaining);
	setRainRate(rainRate);
	setPrecipSituation(precipSituation);
	setSolarRadiation(solarRadiation);
	setFriction(friction);
	setRoadFriction(roadFriction);
    }
    
    /**
     * Construct with required components.
     */
    public WeatherReport(dsrc.ntcip.EssPrecipYesNo isRaining)
    {
	setIsRaining(isRaining);
    }
    
    public void initComponents()
    {
	mComponents[0] = dsrc.ntcip.EssPrecipYesNo.precip;
	mComponents[1] = new dsrc.ntcip.EssPrecipRate();
	mComponents[2] = dsrc.ntcip.EssPrecipSituation.other;
	mComponents[3] = new dsrc.ntcip.EssSolarRadiation();
	mComponents[4] = new dsrc.ntcip.EssMobileFriction();
	mComponents[5] = new CoefficientOfFriction();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return dsrc.ntcip.EssPrecipYesNo.precip;
	    case 1:
		return new dsrc.ntcip.EssPrecipRate();
	    case 2:
		return dsrc.ntcip.EssPrecipSituation.other;
	    case 3:
		return new dsrc.ntcip.EssSolarRadiation();
	    case 4:
		return new dsrc.ntcip.EssMobileFriction();
	    case 5:
		return new CoefficientOfFriction();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "isRaining"
    public dsrc.ntcip.EssPrecipYesNo getIsRaining()
    {
	return (dsrc.ntcip.EssPrecipYesNo)mComponents[0];
    }
    
    public void setIsRaining(dsrc.ntcip.EssPrecipYesNo isRaining)
    {
	mComponents[0] = isRaining;
    }
    
    
    // Methods for field "rainRate"
    public dsrc.ntcip.EssPrecipRate getRainRate()
    {
	return (dsrc.ntcip.EssPrecipRate)mComponents[1];
    }
    
    public void setRainRate(dsrc.ntcip.EssPrecipRate rainRate)
    {
	mComponents[1] = rainRate;
    }
    
    public boolean hasRainRate()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRainRate()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "precipSituation"
    public dsrc.ntcip.EssPrecipSituation getPrecipSituation()
    {
	return (dsrc.ntcip.EssPrecipSituation)mComponents[2];
    }
    
    public void setPrecipSituation(dsrc.ntcip.EssPrecipSituation precipSituation)
    {
	mComponents[2] = precipSituation;
    }
    
    public boolean hasPrecipSituation()
    {
	return componentIsPresent(2);
    }
    
    public void deletePrecipSituation()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "solarRadiation"
    public dsrc.ntcip.EssSolarRadiation getSolarRadiation()
    {
	return (dsrc.ntcip.EssSolarRadiation)mComponents[3];
    }
    
    public void setSolarRadiation(dsrc.ntcip.EssSolarRadiation solarRadiation)
    {
	mComponents[3] = solarRadiation;
    }
    
    public boolean hasSolarRadiation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSolarRadiation()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "friction"
    public dsrc.ntcip.EssMobileFriction getFriction()
    {
	return (dsrc.ntcip.EssMobileFriction)mComponents[4];
    }
    
    public void setFriction(dsrc.ntcip.EssMobileFriction friction)
    {
	mComponents[4] = friction;
    }
    
    public boolean hasFriction()
    {
	return componentIsPresent(4);
    }
    
    public void deleteFriction()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "roadFriction"
    public CoefficientOfFriction getRoadFriction()
    {
	return (CoefficientOfFriction)mComponents[5];
    }
    
    public void setRoadFriction(CoefficientOfFriction roadFriction)
    {
	mComponents[5] = roadFriction;
    }
    
    public boolean hasRoadFriction()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRoadFriction()
    {
	setComponentAbsent(5);
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
	    "WeatherReport"
	),
	new QName (
	    "DSRC",
	    "WeatherReport"
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
				"dsrc.ntcip",
				"EssPrecipYesNo"
			    ),
			    new QName (
				"NTCIP",
				"EssPrecipYesNo"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"precip",
					1
				    ),
				    new MemberListElement (
					"noPrecip",
					2
				    ),
				    new MemberListElement (
					"error",
					3
				    )
				}
			    ),
			    0,
			    dsrc.ntcip.EssPrecipYesNo.precip
			)
		    ),
		    "isRaining",
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
				"dsrc.ntcip",
				"EssPrecipRate"
			    ),
			    new QName (
				"NTCIP",
				"EssPrecipRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.ntcip.EssPrecipRate(0), 
				    new dsrc.ntcip.EssPrecipRate(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "rainRate",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.ntcip",
				"EssPrecipSituation"
			    ),
			    new QName (
				"NTCIP",
				"EssPrecipSituation"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"other",
					1
				    ),
				    new MemberListElement (
					"unknown",
					2
				    ),
				    new MemberListElement (
					"noPrecipitation",
					3
				    ),
				    new MemberListElement (
					"unidentifiedSlight",
					4
				    ),
				    new MemberListElement (
					"unidentifiedModerate",
					5
				    ),
				    new MemberListElement (
					"unidentifiedHeavy",
					6
				    ),
				    new MemberListElement (
					"snowSlight",
					7
				    ),
				    new MemberListElement (
					"snowModerate",
					8
				    ),
				    new MemberListElement (
					"snowHeavy",
					9
				    ),
				    new MemberListElement (
					"rainSlight",
					10
				    ),
				    new MemberListElement (
					"rainModerate",
					11
				    ),
				    new MemberListElement (
					"rainHeavy",
					12
				    ),
				    new MemberListElement (
					"frozenPrecipitationSlight",
					13
				    ),
				    new MemberListElement (
					"frozenPrecipitationModerate",
					14
				    ),
				    new MemberListElement (
					"frozenPrecipitationHeavy",
					15
				    )
				}
			    ),
			    0,
			    dsrc.ntcip.EssPrecipSituation.other
			)
		    ),
		    "precipSituation",
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
				"dsrc.ntcip",
				"EssSolarRadiation"
			    ),
			    new QName (
				"NTCIP",
				"EssSolarRadiation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.ntcip.EssSolarRadiation(0), 
				    new dsrc.ntcip.EssSolarRadiation(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "solarRadiation",
		    3,
		    3,
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
				"dsrc.ntcip",
				"EssMobileFriction"
			    ),
			    new QName (
				"NTCIP",
				"EssMobileFriction"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.ntcip.EssMobileFriction(0), 
				    new dsrc.ntcip.EssMobileFriction(101),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(101)
			    ),
			    null
			)
		    ),
		    "friction",
		    4,
		    3,
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
				"dsrc.dsrc",
				"CoefficientOfFriction"
			    ),
			    new QName (
				"DSRC",
				"CoefficientOfFriction"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CoefficientOfFriction(0), 
				    new CoefficientOfFriction(50),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(50)
			    ),
			    null
			)
		    ),
		    "roadFriction",
		    5,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' WeatherReport object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' WeatherReport object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for WeatherReport
