package com.dahuu.core.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;
import org.thymeleaf.standard.processor.StandardXmlNsTagProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class MyDialect extends AbstractProcessorDialect {

    private static final String DIALECT_NAME = "Score Dialect";

    public MyDialect() {
        super(DIALECT_NAME, "static", StandardDialect.PROCESSOR_PRECEDENCE);
    }

    /*
     * Two attribute processors are declared: 'classforposition' and
     * 'remarkforposition'. Also one element processor: the 'headlines'
     * tag.
     */
    public Set<IProcessor> getProcessors(final String dialectPrefix) {
        final Set<IProcessor> processors = new HashSet<IProcessor>();
//        processors.add(new ClassForPositionAttributeTagProcessor(dialectPrefix));
//        processors.add(new RemarkForPositionAttributeTagProcessor(dialectPrefix));
//        processors.add(new HeadlinesElementTagProcessor(dialectPrefix));
        processors.add(new MySrcAttrProcessor(dialectPrefix));
        processors.add(new MyHrefAttrProcessor(dialectPrefix));
        // This will remove the xmlns:score attributes we might add for IDE validation
        processors.add(new StandardXmlNsTagProcessor(TemplateMode.HTML, dialectPrefix));
        return processors;
    }
//
//	private static final String PREFIX = "my";
//	private static final Set<IProcessor> PROCESSORS;
//
//	static {
//		Set<IProcessor> tmp = new HashSet<>();
//		tmp.add(new MySrcAttrProcessor());
//		PROCESSORS = Collections.unmodifiableSet(tmp);
//	}
//
//	@Override
//	public String getPrefix() {
//		return PREFIX;
//	}
//
//	@Override
//	public boolean isLenient() {
//		return false;
//	}
//
//	@Override
//	public Set<IProcessor> getProcessors() {
//		return PROCESSORS;
//	}

}