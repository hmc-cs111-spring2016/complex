package dsls.complex

import scala.language.implicitConversions

case class Complex(real: Double = 0, imaginary: Double = 0) {
  
  def +(other: Complex) = {
    val newReal = this.real + other.real
    val newImaginary = this.imaginary + other.imaginary
    Complex(newReal, newImaginary)
  }
    
  def *(other: Complex) = {
    val newReal = (this.real * other.real) - (this.imaginary * other.imaginary)
    val newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real)
    Complex(newReal, newImaginary)
  }
  
  def unary_- = Complex(-1) * this
  
  def - = Complex(real, -imaginary)
  
  override def toString = 
    if (imaginary == 0) 
      s"${real}" 
    else
     s"${real} + ${imaginary}i"
}

object Complex {
  implicit def intToComplex(i: Int) = Complex(i)
  implicit def realToComplex(d: Double) = Complex(d)
  object i extends Complex(imaginary = 1)
}