package com.mayabot.nlp.segment.lexer.bigram;


import com.mayabot.nlp.common.injector.ImplementedBy;

/**
 * 查询词ID，两个接续ID中间的共现频率。
 *
 * @author jimichan
 */
@ImplementedBy(value = BiGramTableDictionaryImpl.class)
public interface BiGramTableDictionary {
    int getBiFrequency(int idA, int idB);

    public void refresh() throws Exception;
}
