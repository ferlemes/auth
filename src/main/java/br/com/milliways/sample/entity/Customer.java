/*
 * MIT License
 *
 * Copyright (c) 2024 Fernando Lemes da Silva
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package br.com.milliways.sample.entity;

import static jakarta.persistence.GenerationType.AUTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.DynamicUpdate;

/**
 * This class represents a customer record stored at the database.
 */
@Entity
@DynamicUpdate
public class Customer {

    /**
     * The id of the customer.
     */
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;

    /**
     * The name of the customer.
     */
    @NotNull
    private String name;

    /**
     * Get the id of the customer.
     *
     * @return the id of the customer.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id of the customer.
     *
     * @param id of the customer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name of the customer.
     *
     * @return the name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the customer.
     *
     * @param name of the customer.
     */
    public void setName(String name) {
        this.name = name;
    }

}
