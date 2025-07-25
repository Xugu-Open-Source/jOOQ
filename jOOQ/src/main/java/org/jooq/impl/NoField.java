package org.jooq.impl;

import org.jetbrains.annotations.NotNull;
import org.jooq.Context;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.SortField;
import org.jooq.SortOrder;

final class NoField<T> extends AbstractField<T> implements SortField<T>, QOM.UEmptyField<T> {
  static final NoField<?> INSTANCE = new NoField((DataType)SQLDataType.OTHER);
  
  NoField(DataType<T> type) {
    super(Names.N_NULL, type);
  }

  @Override
  public @NotNull SortField<T> nullsFirst() {
    return null;
  }

  @Override
  public @NotNull SortField<T> nullsLast() {
    return null;
  }

  public final void accept(Context<?> ctx) {
    ctx.visit((Field)DSL.inline((Object)null, getDataType()));
  }
  
  public final SortOrder getOrder() {
    return SortOrder.DEFAULT;
  }
  
  public final Field<T> $field() {
    return this;
  }
  
  public final <U> SortField<U> $field(Field<U> newField) {
    return newField.sortDefault();
  }
  
  public final SortOrder $sortOrder() {
    return SortOrder.DEFAULT;
  }
  
  public final SortField<T> $sortOrder(SortOrder newOrder) {
    return this;
  }
  
/*  public final QOM.NullOrdering $nullOrdering() {
    return null;
  }*/
  
/*  public final SortField<T> $nullOrdering(QOM.NullOrdering newOrdering) {
    return this;
  }*/
}