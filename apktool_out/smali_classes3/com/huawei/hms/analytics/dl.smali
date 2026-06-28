.class public final Lcom/huawei/hms/analytics/dl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ApplySharedPref"
    }
.end annotation


# direct methods
.method private static hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 1

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static ijk(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "../shared_prefs/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".xml"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const-string p0, "SharedPreToolsKit"

    const-string p1, "deleteSPFile(): spName is empty,or context is null"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public static ikl(Landroid/content/Context;Ljava/lang/String;)J
    .locals 3

    if-eqz p0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "../shared_prefs/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".xml"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    const-string p0, "SharedPreToolsKit"

    const-string p1, "deleteSPFile(): spName is empty,or context is null"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 p0, -0x1

    return-wide p0
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p3

    :cond_1
    return p3

    :cond_2
    :goto_0
    const-string p0, "SharedPreToolsKit"

    const-string p1, "context is null or spName empty or spkey is empty"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return p3
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    const-wide/16 v0, -0x1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    :cond_1
    return-wide v0

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-wide v0
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_1
    return-object p3

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    :cond_1
    return p3

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p3
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "openness_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    const-string p0, "SharedPreToolsKit"

    const-string p1, "context is null or spName empty or spkey is empty"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p2, p3, p4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 5

    const-string v0, "SharedPreToolsKit"

    if-eqz p0, :cond_9

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    array-length v1, p2

    if-eqz v1, :cond_8

    array-length v1, p2

    rem-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const/4 p1, 0x0

    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_6

    aget-object v0, p2, p1

    instance-of v1, v0, Ljava/lang/String;

    add-int/lit8 p1, p1, 0x1

    if-eqz v1, :cond_5

    aget-object v1, p2, p1

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_2

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_4

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-interface {p0, v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_4
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_5

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :cond_5
    :goto_1
    add-int/2addr p1, v2

    goto :goto_0

    :cond_6
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    return-void

    :cond_8
    :goto_2
    const-string p0, "putInfos: objects parameter error"

    :goto_3
    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_9
    :goto_4
    const-string p0, "context is null or spName empty"

    goto :goto_3
.end method

.method public static varargs lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    if-eqz p0, :cond_5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    array-length v0, p2

    if-nez v0, :cond_1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void

    :cond_1
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v3, p2, v1

    invoke-interface {p0, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_4
    return-void

    :cond_5
    :goto_1
    const-string p0, "SharedPreToolsKit"

    const-string p1, "clearData(): parameter error.context,spname"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/dl;->hij(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const-string p0, "PE-001"

    const-string p1, "context is null or spName empty or spkey is empty"

    const-string p2, "SharedPreToolsKit"

    invoke-static {p2, p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method
