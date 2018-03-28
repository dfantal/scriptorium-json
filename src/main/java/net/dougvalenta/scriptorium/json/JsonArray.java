/*
 * Copyright 2018 Doug Valenta.
 * Licensed under the terms of the MIT License.
 */
package net.dougvalenta.scriptorium.json;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import net.dougvalenta.scriptorium.Inscribable;

/**
 *
 * @author Doug Valenta
 * @param <THIS> this type
 */
public interface JsonArray<THIS extends JsonArray<THIS>> extends Inscribable<JsonArray<?>, THIS> {
	
	/**
	 * Appends a {@code null} literal element to the array and returns this object.
	 * 
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying 
	 * {@link Appendable}
	 */
	public THIS withNull() throws IOException;
	
	/**
	 * Appends a {@code true} literal element to the array and returns this object.
	 * 
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withFalse()
	 * @see with(boolean)
	 * @see with(Boolean)
	 */
	public THIS withTrue() throws IOException;
	
	/**
	 * Appends a {@code false} literal element to the array and returns this object.
	 * 
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withTrue()
	 * @see with(boolean)
	 * @see with(Boolean)
	 */
	public THIS withFalse() throws IOException;
	
	/**
	 * Appends a string literal element to the array and returns this object.
	 * 
	 * <p>
	 * The contents of the provided {@link CharSequence} will be double-quoted and escaped.
	 * 
	 * <p>
	 * If the provided CharSequence is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the string to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(char)
	 * @see element(CharSequence)
	 * @see element()
	 */
	public THIS with(CharSequence element) throws IOException;
	
	/**
	 * Appends a single-character string literal element to the array and returns this
	 * object.
	 * 
	 * <p>
	 * The provided character will be double-quoted and escaped.
	 * 
	 * @param element the character to append to the array as a string
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Character)
	 * @see with(CharSequence)
	 * @see element(char)
	 * @see element()
	 */
	public THIS with(char element) throws IOException;
	
	/**
	 * Appends a single-character string literal element to the array and
	 * returns this object.
	 * 
	 * <p>
	 * The provided {@link Character} will be double-quoted and escaped.
	 * 
	 * <p>
	 * If the provided CharSequence is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the character to append to the array as a string
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(char)
	 * @see with(CharSequence)
	 * @see element(char)
	 * @see element()
	 */
	public default THIS with(final Character element) throws IOException {
		if (element == null) return withNull();
		return with((char) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link java.math.BigInteger} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 */
	public THIS with(BigInteger element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link java.math.BigDecimal} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 */
	public THIS with(BigDecimal element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Byte} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(byte)
	 */
	public default THIS with(final Byte element) throws IOException {
		if (element == null) return withNull();
		return with((int) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Short} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(short)
	 */
	public default THIS with(final Short element) throws IOException {
		if (element == null) return withNull();
		return with((int) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns this object.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Integer)
	 */
	public THIS with(int element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Integer} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(int)
	 */
	public default THIS with(final Integer element) throws IOException {
		if (element == null) return withNull();
		return with((int) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns this object.
	 * 
	 * <p>
	 * If the provided element is not finite, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Float)
	 */
	public THIS with(float element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Float} is null or not finite, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(float)
	 */
	public default THIS with(final Float element) throws IOException {
		if (element == null) return withNull();
		return with((float) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns this object.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Long)
	 */
	public THIS with(long element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Long} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(long)
	 */
	public default THIS with(final Long element) throws IOException {
		if (element == null) return withNull();
		return with((long) element);
	}
	
	/**
	 * Appends a numeric literal element to the array and returns this object.
	 * 
	 * <p>
	 * If the provided element is not finite, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Double)
	 */
	public THIS with(double element) throws IOException;
	
	/**
	 * Appends a numeric literal element to the array and returns
	 * this object.
	 * 
	 * <p>
	 * If the provided {@link Double} is null or not finite, a {@code null} literal element will be appended.
	 * 
	 * @param element the number to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(double)
	 */
	public default THIS with(final Double element) throws IOException {
		if (element == null) return withNull();
		return with((double) element);
	}
	
	/**
	 * Appends a Boolean literal element to the array and returns this object.
	 * 
	 * @param element the Boolean value to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see with(Boolean)
	 * @see withTrue()
	 * @see withFalse()
	 */
	public THIS with(boolean element) throws IOException;
	
	/**
	 * Appends a Boolean literal element to the array and returns this object.
	 * 
	 * <p>
	 * If the provided {@link Boolean} is null, a {@code null} literal element will be appended.
	 * 
	 * @param element the Boolean value to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withNull()
	 * @see with(boolean)
	 * @see withTrue()
	 * @see withFalse() 
	 */
	public default THIS with(final Boolean element) throws IOException {
		if (element == null) return withNull();
		return with((boolean) element);
	}
	
	/**
	 * Appends the provided elements to the array and returns this object.
	 * 
	 * Any null elements will be appended as {@code null} literals.
	 * 
	 * Any non-null {@link CharSequence} or {@link Character} elements will be appended
	 * as double-quoted and escaped string literals.
	 * 
	 * Any non-null {@link Byte}, {@link Short}, {@link Integer}, {@link Float},
	 * {@link Long}, {@link Double}, {@link BigInteger}, {@link BigDecimal},
	 * {@link AtomicInteger}, or {@link AtomicLong} elements will be appended as
	 * numeric literals.
	 * 
	 * Any non-null {@link Boolean} elements will be appended as Boolean value literals.
	 * 
	 * If {@code elements} is null or empty, this method has no effect.
	 * 
	 * @param elements to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withAll(Iterable)
	 */
	public THIS withAll(Object... elements) throws IOException;
	
	/**
	 * Appends the provided elements to the array and returns this object.
	 * 
	 * Any null elements will be appended as {@code null} literals.
	 * 
	 * Any non-null {@link CharSequence} or {@link Character} elements will be appended
	 * as double-quoted and escaped string literals.
	 * 
	 * Any non-null {@link Byte}, {@link Short}, {@link Integer}, {@link Float},
	 * {@link Long}, {@link Double}, {@link BigInteger}, {@link BigDecimal},
	 * {@link AtomicInteger}, or {@link AtomicLong} elements will be appended as
	 * numeric literals.
	 * 
	 * Any non-null {@link Boolean} elements will be appended as Boolean value literals.
	 * 
	 * If {@code elements} is null or empty, this method has no effect.
	 * 
	 * @param elements to append to the array
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see withAll(Object...)
	 */
	public THIS withAll(Iterable<?> elements) throws IOException;
	
	/**
	 * Appends an empty JSON array as an element of this array and returns this object.
	 * 
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 */
	public THIS withEmptyArray() throws IOException;
	
	/**
	 * Appends an empty JSON object as an element of this array and returns this object.
	 * 
	 * @return this object
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 */
	public THIS withEmptyObject() throws IOException;
	
	/**
	 * Begins a new string literal element of this array and returns a {@link JsonValue}
	 * that can be used to append characters to it.
	 * 
	 * <p>
	 * Calling the {@link JsonValue#then()} method of the returned JsonValue will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonValue#then()} method
	 * of the returned JsonValue may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * When this method returns, an opening double-quote (preceded by a comma, if appropriate)
	 * will have already been appended to the underlying {@link Appendable}.
	 * 
	 * @return a JsonValue representing a new string literal element of this array
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see JsonValue
	 * @see element(CharSequence)
	 * @see element(char)
	 * @see with(CharSequence)
	 * @see with(Character)
	 * @see with(char)
	 */
	public JsonValue<THIS> element() throws IOException;
	
	/**
	 * Begins a new string literal element of this array beginning with the provided
	 * {@link CharSequence} and returns a {@link JsonValue} that can be used to
	 * append additional characters to it.
	 * 
	 * <p>
	 * Calling the {@link JsonValue#then()} method of the returned JsonValue will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonValue#then()} method
	 * of the returned JsonValue may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * The contents of the provided CharSequence will be escaped.
	 * 
	 * <p>
	 * If the provided CharSequence is null, nothing will be prepended to the element.
	 * I.e., when this method returns only an opening double-quote (preceded by a comma, if 
	 * appropriate) will be appended to the underlying {@link Appendable}
	 * 
	 * @param element the beginning characters of the new string literal element
	 * @return a JsonValue representing a new string literal element of this array
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see JsonValue
	 * @see element()
	 * @see element(Character)
	 * @see element(char)
	 * @see with(CharSequence)
	 */
	public JsonValue<THIS> element(CharSequence element) throws IOException;
	
	/**
	 * Begins a new string literal element of this array beginning with the provided
	 * character and returns a {@link JsonValue} that can be used to append additional
	 * characters to it.
	 * 
	 * <p>
	 * Calling the {@link JsonValue#then()} method of the returned JsonValue will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonValue#then()} method
	 * of the returned JsonValue may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * When this method returns, an opening bracket (preceded by a comma, if appropriate)
	 * and the provided character will have already been appended to the underlying 
	 * {@link Appendable}. The provided character will be escaped.
	 * 
	 * @param element the first character of the new string literal element
	 * @return a JsonValue representing a new string literal element of this array
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see JsonValue
	 * @see element()
	 * @see element(CharSequence)
	 * @see with(char)
	 */
	public JsonValue<THIS> element(char element) throws IOException;
	
	/**
	 * Begins a new string literal element of this array beginning with the provided
	 * character and returns a {@link JsonValue} that can be used to append additional
	 * characters to it.
	 * 
	 * <p>
	 * Calling the {@link JsonValue#then()} method of the returned JsonValue will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonValue#then()} method
	 * of the returned JsonValue may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * The provided character will be escaped.
	 * 
	 * <p>
	 * If the provided {@link Character} is null, nothing will be prepended to the element.
	 * I.e., when this method returns only an opening double-quote (preceded by a comma, if 
	 * appropriate) will be appended to the underlying {@link Appendable}
	 * 
	 * @param element the first character of the new string literal element
	 * @return a JsonValue representing a new string literal element of this array
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 * @see JsonValue
	 * @see element()
	 * @see element(CharSequence)
	 * @see with(char)
	 */
	public default JsonValue<THIS> element(final Character element) throws IOException {
		if (element == null) return element();
		return element((char) element);
	}
	
	/**
	 * Begins a new JSON array element of this array and returns a {@link JsonArrayNode}
	 * that can be used to append elements to it.
	 * 
	 * <p>
	 * Calling the {@link JsonArrayNode#then()} method of the returned JsonArrayNode will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonArrayNode#then()} method
	 * of the returned JsonArrayNode may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * When this method returns, an opening bracket (preceded by a comma, if appropriate)
	 * will have already been appended to the underlying {@link Appendable}
	 * 
	 * @return a {@link JsonArrayNode} representing the new JSON array element 
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 */
	public JsonArrayNode<THIS> array() throws IOException;
	
	/**
	 * Begins a new JSON object element of this array and returns a {@link JsonObjectNode}
	 * that can be used to append key-value pairs to it.
	 * 
	 * <p>
	 * Calling the {@link JsonObjectNode#then()} method of the returned JsonObjectNode will
	 * return this object.
	 * 
	 * <p>
	 * Calling any method of this object before the {@link JsonObjectNode#then()} method
	 * of the returned JsonObjectNode may result in invalid output and/or an unchecked
	 * exception.
	 * 
	 * <p>
	 * When this method returns, and opening brace (preceded by a comma, if appropriate)
	 * will have already been appended to the underlying {@link Appendable}
	 * 
	 * @return a {@link JsonObjectNode} representing the new JSON object element
	 * @throws IOException if an exception occurs while appending to the underlying
	 * {@link Appendable}
	 */
	public JsonObjectNode<THIS> object() throws IOException;
	
}
