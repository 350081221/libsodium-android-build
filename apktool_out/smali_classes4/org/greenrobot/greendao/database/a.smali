.class public interface abstract Lorg/greenrobot/greendao/database/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
.end method

.method public abstract beginTransaction()V
.end method

.method public abstract close()V
.end method

.method public abstract compileStatement(Ljava/lang/String;)Lorg/greenrobot/greendao/database/c;
.end method

.method public abstract endTransaction()V
.end method

.method public abstract execSQL(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract inTransaction()Z
.end method

.method public abstract isDbLockedByCurrentThread()Z
.end method

.method public abstract isOpen()Z
.end method

.method public abstract setTransactionSuccessful()V
.end method
